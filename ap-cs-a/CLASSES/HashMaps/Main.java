public class Main {
    public static void main(String[] args) {
        String text = "In the quiet town of Elmsford, where the streets meander like forgotten whispers, a peculiar incident unfolded one misty evening. At precisely 7:47 p.m., Mrs. Penelope Hartley, an eccentric widow known for her collection of porcelain teapots, heard an unusual sound emanating from her attic. \"Good heavens!\" she exclaimed, clutching her shawl tighter around her frail shoulders. The noise, a faint but persistent tapping, seemed to grow louder with each passing second. Meanwhile, across the street, young Tommy Jenkins was concocting yet another of his infamous pranks. Unbeknownst to him, his latest scheme would inadvertently trigger a series of events that the town would talk about for years. As the clock struck eight, a sudden flash of lightning illuminated the sky, casting eerie shadows on the cobblestone paths. Dogs barked, windows rattled, and somewhere in the distance, a door creaked open. The air thickened with anticipation. Little did they know, the night was just beginning.";
        WordAnalyzer wa = new WordAnalyzer(text);
        wa.refresh();
        System.out.println(wa);
    }
}
