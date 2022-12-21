public class singlyLinkedList {
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

        public Node head = null;
        public Node tail = null;

        public void addNode(String data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
            }
            else{
                tail.next = newNode;
            }
            tail = newNode;
        }

        public int size(){
            int size = 0;
            Node node = head;
            while(node != tail){
                size += 1;
                node = node.next;
            }
            return size;
        }

        public boolean checkForContainedWords(String x){
            Node current = head;
            while(current.next != null){
                if(x.contains(current.data) && !x.equals(current.data))
                    return true;
                else
                    current = current.next;
            }
            return false;
        }

        public String checkForLongestWord(){
            Node current = head;
            String word= head.data;
            if(head == null)
                return null;
            else{
                while(current != null){
                    if(current.data.length() < word.length()){
                        current = current.next;
                        continue;
                    }
                    if(checkForContainedWords(current.data) && word.length()<= current.data.length()){
                        word = current.data;
                    }

                    current = current.next;
                }
                return word;
            }
        }


    }


