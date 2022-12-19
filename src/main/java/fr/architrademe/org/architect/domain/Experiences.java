package fr.architrademe.org.architect.domain;

import java.util.Objects;

// VO
public final class Experiences {

    private final String companyName;
    private final String missionType;
    private final int missionDuration;

    private Experiences(String companyName,
                        String missionType,
                        int missionDuration) {
        this.companyName = companyName;
        this.missionType = missionType;
        this.missionDuration = missionDuration;
    }

    public static Experiences of(String companyName,
                                 String missionType,
                                 int missionDuration) {
        return new Experiences(companyName, missionType, missionDuration);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Experiences that = (Experiences) o;
        return missionDuration == that.missionDuration && Objects.equals(companyName, that.companyName) && Objects.equals(missionType, that.missionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, missionType, missionDuration);
    }

    @Override
    public String toString() {
        return "Experiences{" +
                "companyName='" + companyName + '\'' +
                ", missionType='" + missionType + '\'' +
                ", missionDuration=" + missionDuration +
                '}';
    }
}
