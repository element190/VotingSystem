public class Candidate implements Okay,Constituency {
    private int candidateId;
    private String candidateFirstName;
    private String candidateSecondName;
    private String candidateSurname;
    private String candidateMaidenName;
    private String candidateAddress;
    private String candidateGender;
    private String candidatePhoneNumber;
    private String candidateEmailAddress;
    private String candidateState;
    private String candidateOccupation;
    private String candidateDateOfBirth;
    private int candidatePartyId;



    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateFirstName() {
        return candidateFirstName;
    }

    public void setCandidateFirstName(String candidateFirstName) {
        this.candidateFirstName = candidateFirstName;
    }

    public String getCandidateSecondName() {
        return candidateSecondName;
    }

    public void setCandidateSecondName(String candidateSecondName) {
        this.candidateSecondName = candidateSecondName;
    }

    public String getCandidateSurname() {
        return candidateSurname;
    }

    public void setCandidateSurname(String candidateSurname) {
        this.candidateSurname = candidateSurname;
    }

    public String getCandidateMaidenName() {
        return candidateMaidenName;
    }

    public void setCandidateMaidenName(String candidateMaidenName) {
        this.candidateMaidenName = candidateMaidenName;
    }

    public String getCandidateAddress() {
        return candidateAddress;
    }

    public void setCandidateAddress(String candidateAddress) {
        this.candidateAddress = candidateAddress;
    }

    public String getCandidateGender() {
        return candidateGender;
    }

    public void setCandidateGender(String candidateGender) {
        this.candidateGender = candidateGender;
    }

    public String getCandidatePhoneNumber() {
        return candidatePhoneNumber;
    }

    public void setCandidatePhoneNumber(String candidatePhoneNumber) {
        this.candidatePhoneNumber = candidatePhoneNumber;
    }

    public String getCandidateEmailAddress() {
        return candidateEmailAddress;
    }

    public void setCandidateEmailAddress(String candidateEmailAddress) {
        this.candidateEmailAddress = candidateEmailAddress;
    }

    public String getCandidateState() {
        return candidateState;
    }

    public void setCandidateState(String candidateState) {
        this.candidateState = candidateState;
    }

    public String getCandidateOccupation() {
        return candidateOccupation;
    }

    public void setCandidateOccupation(String candidateOccupation) {
        this.candidateOccupation = candidateOccupation;
    }

    public String getCandidateDateOfBirth() {
        return candidateDateOfBirth;
    }

    public void setCandidateDateOfBirth(String candidateDateOfBirth) {
        this.candidateDateOfBirth = candidateDateOfBirth;
    }

    public int getCandidatePartyId() {
        return candidatePartyId;
    }

    public void setCandidatePartyId(int candidatePartyId) {
        this.candidatePartyId = candidatePartyId;
    }

    @Override
    public void constituencyId() {
        System.out.println("234");;
    }

    @Override
    public final int electionId() {
        return electionId();
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
