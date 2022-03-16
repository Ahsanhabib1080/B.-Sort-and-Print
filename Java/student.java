public class student {
    public int ROLL;
    public String NAME;
    public int MARKS;
    public String DEPT;
    public String RESULT;

    public void setROLL(int ROLL) {
        this.ROLL = ROLL;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setMARKS(int MARKS) {
        this.MARKS = MARKS;
    }
    
    public void setDEPT(String DEPT) {
        this.DEPT = DEPT;
    }
    
    public int getROLL() {
        return ROLL;
    }

    public String getNAME() {
        return NAME;
    }

    public int getMARKS() {
        return MARKS;
    }

    public String getDEPT() {
        return DEPT;
    }

    public void setRESULT(String string) {
        this.RESULT = string;
    }

    public String getRESULT() {
        return RESULT;
    }

    public void display() {
        System.out.println("ROLL: " + ROLL + "  NAME: " + NAME + "  MARKS: " + MARKS + "  RESULT: " + RESULT + "  DEPT: " + DEPT);
    }

    public Boolean isPass() {
        if (MARKS >= 40) {
            return true;
        } else {
            return false;
        }
    }
}
