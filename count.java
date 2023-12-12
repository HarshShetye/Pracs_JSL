class count {
    public static void main(String[] args) {
        String s = new String("Harsh scored 9.57 in semester 4!");
        int i, al = 0, no = 0, sc = 0, sp = 0, vow = 0, con = 0;
        char c;
        for (i = 0; i < s.length(); i++) {
            s = s.toLowerCase();
            c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                no += 1;
            } else if (c >= 'a' && c <= 'z') {
                al += 1;
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vow += 1;
                } else {
                    con += 1;
                }
            } else if (c == ' ') {
                sp += 1;
            } else {
                sc += 1;
            }
        }
        System.out.println("Alphabet " + al + "\nvowels " + vow + "\nconso " + con + "\ndigits " + no + "\nspaces " + sp
                + "\nwords " + (sp + 1) + "\nschar " + sc);
    }
}
