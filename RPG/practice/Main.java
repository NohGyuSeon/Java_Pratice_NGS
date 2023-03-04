package NGS.RPG.practice;

public class Main {
	
	public static void main(String[] args) {
		
		Knight uther = new HolyKnight("우서", 200, 10);
		Knight arthas = new MagicKnight("아서스", 150, 8);
	
		uther.increaseHp();
		uther.increaseArmor();
		
		HolyKnight holyUther = (HolyKnight) uther;
		holyUther.healingAura();
		holyUther.holyArmor();
		
		arthas.increaseHp();
		arthas.increaseArmor();
		
		MagicKnight magicArthas = (MagicKnight) arthas;
		magicArthas.fireArmor();
		
	}
	
}

interface Tanker {
	public void increaseArmor();
	public void increaseHp();
}

interface Healer {
	public void healingAura();
	public void holyArmor();
}

interface Sorecrer {
	public void fireArmor();
	public void thunderBlade();
}

class Knight implements Tanker {
	protected String name;
	protected int hp;
	protected int armor;
	
	public Knight(String name, int hp, int armor) {
		this.name = name;
		this.hp = hp;
		this.armor = armor;
	}
	
	@Override
	public void increaseArmor() {
		System.out.printf("[%s] increaseArmor() 시전!\n", name);
		System.out.printf("\t아머가 +5 증가\n");
		armor += 5;		
	}
	
	@Override
	public void increaseHp() {
		System.out.printf("[%s] increaseHp() 시전!\n", name);
		System.out.printf("\t체력이 +100 증가\n");
		hp += 100;
	}
}

class HolyKnight extends Knight implements Healer {
	
	public HolyKnight(String name, int hp, int armor) {
		super(name, hp, armor);
	}

	@Override
	public void healingAura() {
		System.out.printf("[%s] healingAura() 시전!\n", name);
		System.out.printf("\t초당 체력회복 +10\n");
	}
	
	@Override
	public void holyArmor() {
		System.out.printf("[%s] holyArmor() 시전!\n", name);
		System.out.printf("\t피격 시 데미지 감소 -10\n");
	}
}

 class MagicKnight extends Knight implements Sorecrer {
	 
	 public MagicKnight(String name, int hp, int armor) {
		 super(name, hp, armor);
	 }

	@Override
	public void fireArmor() {
		System.out.printf("[%s] fireArmor() 시전!\n", name);
		System.out.printf("\t초당 주변 데미지 +10\n");
	}
	
	@Override
	public void thunderBlade() {
		System.out.printf("[%s] thunderBlade() 시전!\n", name);
		System.out.printf("\t공격 시 추가 데미지 +10\n");
	}
	
 }
 