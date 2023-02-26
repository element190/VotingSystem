public class Citizen extends Vote{
     private int citizenId;
     private String citizenFirstName;
     private String citizenSecondName;
     private String Surname;
     private String maidenName;
     private String address;
     private String gender;
     private String phoneNumber;
     private String emailAddress;
     private String state;
     private int voterId;
     //private String bloodGroup;
     private String occupation;

     private String dateOfBirth;

     private String education;


     public int getCitizenId() {
          return citizenId;
     }

     public void setCitizenId(int citizenId) {
          this.citizenId = citizenId;
     }

     public String getCitizenFirstName() {
          return citizenFirstName;
     }

     public void setCitizenFirstName(String citizenFirstName) {
          this.citizenFirstName = citizenFirstName;
     }

     public String getCitizenSecondName() {
          return citizenSecondName;
     }

     public void setCitizenSecondName(String citizenSecondName) {
          this.citizenSecondName = citizenSecondName;
     }

     public String getSurname() {
          return Surname;
     }

     public void setSurname(String surname) {
          Surname = surname;
     }

     public String getMaidenName() {
          return maidenName;
     }

     public void setMaidenName(String maidenName) {
          this.maidenName = maidenName;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public String getGender() {
          return gender;
     }

     public void setGender(String gender) {
          this.gender = gender;
     }

     public String getPhoneNumber() {
          return phoneNumber;
     }

     public void setPhoneNumber(String phoneNumber) {
          this.phoneNumber = phoneNumber;
     }

     public String getEmailAddress() {
          return emailAddress;
     }

     public void setEmailAddress(String emailAddress) {
          this.emailAddress = emailAddress;
     }

     public String getState() {
          return state;
     }

     public void setState(String state) {
          this.state = state;
     }

     public int getVoterId() {
          return voterId;
     }

     public void setVoterId(int voterId) {
          this.voterId = voterId;
     }

     public String getOccupation() {
          return occupation;
     }

     public void setOccupation(String occupation) {
          this.occupation = occupation;
     }

     public String getDateOfBirth() {
          return dateOfBirth;
     }

     public void setDateOfBirth(String dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
     }

     public String getEducation() {
          return education;
     }

     public void setEducation(String education) {
          this.education = education;
     }

     @Override
     public String toString() {
          return "Citizen{" +
                  "citizenId=" + citizenId +
                  ", citizenFirstName='" + citizenFirstName + '\'' +
                  ", citizenSecondName='" + citizenSecondName + '\'' +
                  ", Surname='" + Surname + '\'' +
                  ", maidenName='" + maidenName + '\'' +
                  ", address='" + address + '\'' +
                  ", gender='" + gender + '\'' +
                  ", phoneNumber='" + phoneNumber + '\'' +
                  ", emailAddress='" + emailAddress + '\'' +
                  ", state='" + state + '\'' +
                  ", voterId=" + voterId +
                  ", occupation='" + occupation + '\'' +
                  ", dateOfBirth='" + dateOfBirth + '\'' +
                  ", education='" + education + '\'' +
                  '}';
     }
}
