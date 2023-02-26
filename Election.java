public class Election implements Constituency {
    private int electionId;
    private String electionDate;
    private String electionType;
    private String ResultDate;
    private String details;

    public int getElectionId() {
        return electionId;
    }

    public void setElectionId(int electionId) {
        this.electionId = electionId;
    }

    public String getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(String electionDate) {
        this.electionDate = electionDate;
    }

    public String getElectionType() {
        return electionType;
    }

    public void setElectionType(String electionType) {
        this.electionType = electionType;
    }

    public String getResultDate() {
        return ResultDate;
    }

    public void setResultDate(String resultDate) {
        ResultDate = resultDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public void constituencyId() {
        System.out.println("45");
    }

    @Override
    public int electionId() {
        return 234;
    }

    @Override
    public String city() {
        return "Lagos";
    }

    @Override
    public String[] electionType() {
        return new String[0];
    }
}
