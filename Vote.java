public class Vote extends Election{
    private int voteId;
    private int candidateId;

    public void candidateId(String name, int number){
        System.out.printf("The candidate's name is %s with id number:%d",name,number);
    }

    public void voteId(String citizenName, int citizenId){
        System.out.printf("The citizen's name is %s with id number:%d",citizenName,citizenId);
    }
}
