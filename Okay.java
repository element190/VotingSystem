public interface Okay {
    public enum Party {
    PDP("PEOPLE DEMOCRACY PARTY", 001),
    ACN("ACTION CONGRESS OF NIGERIA",002),
    SDP("SUSTAINABLE DEVELEOPMENT PARTY",003),
    LP("LABOUR PARTY",004),
    BOOT("BOOT PARTY",005);

    private final String title;
    private final int partyId;

    Party(String title, int partyId) {
        this.title = title;
        this.partyId = partyId;
    }

    public String getTitle() {
        return title;
    }

    public int getPartyId() {
        return partyId;
    }

    @Override
    public String toString() {
        return "Party{" +
                "title='" + title + '\'' +
                ", partyId=" + partyId +
                '}';
    }
}

}
