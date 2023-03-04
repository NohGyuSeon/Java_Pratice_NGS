package NGS.NHN.practice.day16.first.ball;

import java.util.List;

public interface Movable {
	public void next(List<Motion> effects);
	public void stop();
	
	public void setMotion(Motion motion);

	public void turnX();
	public void turnY();
}
