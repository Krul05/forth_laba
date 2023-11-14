public enum Characters {
    Junior("Малыш"),
    Carlson("Карлсон"),
    UncleJulius("Дядя Юлиус"),
    MissBok("Фрекен Бок"),
    Betan("Бетан"),
    Bosse("Боссе");
    private final String name;

    Characters(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
