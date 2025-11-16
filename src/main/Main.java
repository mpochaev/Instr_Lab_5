class Main {
    public static void main(String[] args) {
        System.out.println(DefaultMessage());
        System.out.println(Commit2());
        System.out.println(Commit3());
        System.out.println(Commit4());
        System.out.println(Commit5());
    }

    static String DefaultMessage() {
        return "Это изменено в ветке main";
    }
    static String Commit2() {
        return "Коммит #2";
    }
    static String Commit3() {
        return "Коммит #3";
    }
    static String Commit4() {
        return "Коммит #4";
    }
    static String Commit5() {
        return "Коммит #5";
    }
}