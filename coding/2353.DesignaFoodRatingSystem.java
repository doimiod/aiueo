class FoodRatings {
    HashMap<String, TreeSet<String>> cuiToFood = new HashMap();
    HashMap<String, Integer> foodToRat = new HashMap(); // food, rating
    HashMap<String, String> foodToCui = new HashMap(); // food, syurui
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i = 0; i < foods.length; i++){
            TreeSet<String> foodOfThisCuisine = cuiToFood.getOrDefault(cuisines[i], new TreeSet<String> ((a,b)->
            foodToRat.get(a).equals(foodToRat.get(b)) ? a.compareTo(b) : foodToRat.get(b)-foodToRat.get(a)));

            
            foodToRat.put(foods[i], ratings[i]);
            foodOfThisCuisine.add(foods[i]);
            foodToCui.put(foods[i], cuisines[i]);    
            
            cuiToFood.put(cuisines[i], foodOfThisCuisine);
        }
    }
    
    // CompareTo() is used to compare whether 2 strings are equal in hashSet! So remove, change value of key in HashMap, then insert again
    public void changeRating(String food, int newRating) {
        String cui = foodToCui.get(food);
        TreeSet<String> foodOfThisCui = cuiToFood.get(cui);
        foodOfThisCui.remove(food);
        foodToRat.put(food, newRating);
        
        foodOfThisCui.add(food);
        cuiToFood.put(cui, foodOfThisCui);
    }
    
    public String highestRated(String cuisine) {
        return cuiToFood.get(cuisine).first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */

//  x.putIfAbsent(cuisines[i], new PriorityQueue<>((a,b)->
//             b.rating==a.rating ? a.name.compareTo(b.name) : b.rating-a.rating));