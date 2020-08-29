package Collections.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    //equals and hashcode go hand in hand. when comparing two objects, the hash code of a given object goes into a "bucket"
    //that bucket needs to be the same for two objects that are to be the same. thus why you need to override both equals and hashcode
    //(also the reason why when you use shortcut alt+insert you'll see both option together (override equals and hashcode)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        System.out.println("comparing heavenly body");
        String that = ((HeavenlyBody) o).getName();
        return this.name.equals(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
