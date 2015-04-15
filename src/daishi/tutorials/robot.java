package daishi.tutorials;

public abstract class robot {
    private head _head;
    private torso _torso;
    private arm _leftArm;
    private arm _rightArm;
    private leg _leftLeg;
    private leg _rightLeg;

    public head getHead() {
        return _head;
    }

    public void setHead(head head) {
        _head = head;
    }

    public torso getTorso() {
        return _torso;
    }

    public void setTorso(torso torso) {
        _torso = torso;
    }

    public arm getLeftArm() {
        return _leftArm;
    }

    public void setLeftArm(arm leftArm) {
        _leftArm = leftArm;
    }

    public arm getRightArm() {
        return _rightArm;
    }

    public void setRightArm(arm rightArm) {
        _rightArm = rightArm;
    }

    public leg getleftLeg() {
        return _leftLeg;
    }

    public void setLeftLeg(leg leftLeg) {
        _leftLeg = leftLeg;
    }

    public leg getRightLeg() {
        return _rightLeg;
    }

    public void setRightLeg(leg rightLeg) {
        _rightLeg = rightLeg;
    }
}
