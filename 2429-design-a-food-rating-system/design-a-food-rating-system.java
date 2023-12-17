class Food implements Comparable{
    public final String food;
    public final String cuisine;
    public int rating;
    
    public Food(String food, String cuisine, int rating){
        this.food = food;
        this.cuisine = cuisine;
        this.rating = rating;
    }
    
    public int compareTo(Object other){
        Food otherFood =  ((Food)other);
        int ratingDiff = this.rating -otherFood.rating;
        return ratingDiff == 0 ? otherFood.food.compareTo(this.food) : ratingDiff;
    }
}


class FoodRatings {
    
    Map<String,Food> foodMap = new HashMap<>();
    Map<String,TreeSet<Food>> cuisineToFoods = new HashMap<>();
    
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0;i<foods.length;i++){
            Food f = new Food(foods[i],cuisines[i],ratings[i]);
            foodMap.put(foods[i],f);
            cuisineToFoods.putIfAbsent(cuisines[i],new TreeSet<Food>());
            cuisineToFoods.get(cuisines[i]).add(f);
        }
    }
    
    public void changeRating(String food, int newRating) {
        Food currFood = foodMap.get(food);
        cuisineToFoods.get(currFood.cuisine).remove(currFood);
        currFood.rating=newRating;
        cuisineToFoods.get(currFood.cuisine).add(currFood);
        
    }
    
    public String highestRated(String cuisine) {
        return cuisineToFoods.get(cuisine).last().food;
    }
}