public class Test {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        System.out.println(puzzle.generateTenRolls(20));
        System.out.println(puzzle.getRandomLetter());
        System.out.println(puzzle.generatePassword());
        System.out.println(puzzle.getNewPasswordSet(5));
        System.out.println(puzzle.shuffleArray(puzzle.getNewPasswordSet(5)));
    }
}