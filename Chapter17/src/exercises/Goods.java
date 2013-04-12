package exercises;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 14:54
 */
public class Goods {
    private String id;
    private String name;

    public Goods(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * (result + ((id == null) ? 0 : id.hashCode()));
        return result;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Goods)) {
            return false;
        }

        Goods other = (Goods)obj;
        return id.equals(other.id);
    }

    public String toString() {
        return "货物编号：" + id + "\t货物名称：" + name;
    }
}
