class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int maxHealth = health;
        int currentHealth = health; 
        int currentBandageTime = 0; 
        int nextAttackIndex = 0; 
        int totalTime = attacks[attacks.length - 1][0]; 


        for (int time = 1; time <= totalTime; time++) {
            if (nextAttackIndex < attacks.length && attacks[nextAttackIndex][0] == time) {

                currentHealth -= attacks[nextAttackIndex][1];
                nextAttackIndex++;
                currentBandageTime = 0; 
            } else {
                if (currentBandageTime < t) {
                    currentHealth = Math.min(maxHealth, currentHealth + x);
                    currentBandageTime++;
                    if (currentBandageTime == t) {
                        currentHealth = Math.min(maxHealth, currentHealth + y);
                        currentBandageTime = 0; 
                    }
                }
            }

            if (currentHealth <= 0) {
                return -1;
            }
        }

        return currentHealth;
    }
}