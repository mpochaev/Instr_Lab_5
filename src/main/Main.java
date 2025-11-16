class Main {
    public static void main(String[] args) {
        System.out.println(DefaultMessage());
        System.out.println(Commit2());
    }

    static String DefaultMessage() {
        return "Это изменено в ветке main";
    }
    static String Commit2() {
        return "Коммит #2";
    }
}