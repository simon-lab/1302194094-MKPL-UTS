package lib;

public class Gender {
    
    private enum jenisKelamin{laki, perempuan}
    private boolean isForeigner;
	private jenisKelamin gender;


    public boolean isIsForeigner() {
        return this.isForeigner;
    }

    public boolean getIsForeigner() {
        return this.isForeigner;
    }

    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    public jenisKelamin getGender() {
        return this.gender;
    }

    public void setGender(jenisKelamin gender) {
        this.gender = gender;
    }

}
