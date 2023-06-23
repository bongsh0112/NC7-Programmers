class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // ∨ : t하나라도 있으면 t // ∧ : f하나라도 있으면 f
        // x1 v x2, x3 v x4 둘 중 하나라도 false면 그냥 false
        // => (x1, x2)가 모두 false이거나, (x3, x4)가 모두 false면 그냥 false
        return (x1 == false && x2 == false) || (x3 == false && x4 == false) ? false : true;
    }
}