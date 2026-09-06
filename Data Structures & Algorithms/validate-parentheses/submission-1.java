class Solution {
    public boolean isValid(String s) {
    HashMap<Character, Character> bracketMap = new HashMap<>();
    bracketMap.put(')', '(');
    bracketMap.put('}', '{');
    bracketMap.put(']', '[');
    Stack<Character> stack = new Stack<>();
    for (char c: s.toCharArray()){
        if (bracketMap.containsKey(c)){
            if (stack.isEmpty()){
                return false;
            }
            char top = stack.pop();
            if (top != bracketMap.get(c)){
                return false;
            }
        } else {
                stack.push(c);
        }
    }
    return stack.isEmpty();
    }
}
