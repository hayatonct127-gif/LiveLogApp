public class BandDto {
    private String name;
    private String country;
    private int memberCount;

    public BandDto(String name, String country, int memberCount) {
        this.name = name;
        this.country = country;
        this.memberCount = memberCount;
    }

    public String getName() {
        return name;
    } 
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    } 

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        if(memberCount < 0) {
           return; 
        }
        this.memberCount = memberCount;
    }
}
