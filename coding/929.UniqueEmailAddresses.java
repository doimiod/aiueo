class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i<emails.length; i++){
            String str = emails[i];

                String firstPart = str.substring(0, str.indexOf('@'));
                String secondPart = str.substring(str.indexOf('@'));

                if(firstPart.indexOf("+") != -1)
                firstPart = firstPart.substring(0, firstPart.indexOf("+"));

                firstPart = firstPart.replace(".", "");

                str = firstPart + secondPart;
                set.add(str);
        }
        return set.size(); 
    }
}