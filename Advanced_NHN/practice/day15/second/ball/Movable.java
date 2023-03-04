package NGS.NHN.practice.day15.second.ball;

import java.util.List;

public interface Movable {
    void next(List<Motion> effects);

    void setMotion(Motion motion);
}
