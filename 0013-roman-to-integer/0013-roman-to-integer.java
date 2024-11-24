class Solution {
    int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                total -= romanMap.get(s.charAt(i));
            } else {
                total += romanMap.get(s.charAt(i));
            }
        }
        return total;
    }
}