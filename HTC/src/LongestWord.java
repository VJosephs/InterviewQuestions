public class LongestWord {
    public String LongestWord (String[] words){
        singlyLinkedList list = new singlyLinkedList();
        for(String word: words)
            list.addNode(word);
        return list.checkForLongestWord();

    }

}

