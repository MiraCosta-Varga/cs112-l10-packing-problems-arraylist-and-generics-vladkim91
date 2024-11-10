public class Setup {
  
/*
****************DO NOT EDIT THIS CLASS***************
*/
  private static Food[] food = new Food[10];
  private static Parts[] parts = new Parts[10];
  private static Supplies[] supplies = new Supplies[10];

  public Setup() {
    setUp();
  }

  public static void setUp() {
    food[0] = new Food("Apple", 20, true); 
    food[1] = new Food("Bread", 15, true); 
    food[2] = new Food("Peanut", 50, false); 
    food[3] = new Food("Canned Soup", 40, false); 
    food[4] = new Food("Water Bottle", 30, false);
    food[5] = new Food("Canned Tuna", 30, false);
    food[6] = new Food("Orange", 35, true);
    food[7] = new Food("Liquid Salt", 50, false);
    food[8] = new Food("Liquid Pepper", 50, false);
    food[9] = new Food("Protein Bar", 60, false);
    parts[0]  = new Parts("Solar Panel", 20, 10080);
    parts[1] = new Parts("Copper Wiring", 50, 10055); 
    parts[2] = new Parts("Steel Clasp", 4, 10005); 
    parts[3] = new Parts("Steel Truss", 2, 10007);  
    parts[4] = new Parts("Pressurized Canister", 10, 10020);
    parts[5] = new Parts("Aluminum Vent", 5, 10062);
    parts[6] = new Parts("Steel Panel", 10, 10001);
    parts[7] = new Parts("Titanium Panel", 40, 10030);
    parts[8] = new Parts("Titanium Fastener", 90, 10031);
    parts[9] = new Parts("Steel Ball Bearing", 40, 10013);
    supplies[0] = new Supplies("AG7 Pen", 25);
    supplies[1] = new Supplies("Lined Notepad", 20);
    supplies[2] = new Supplies("Sanitary Wipe", 35);
    supplies[3] = new Supplies("First Aid Kit", 10);
    supplies[4] = new Supplies("Sleep Restraint", 10);
    supplies[5] = new Supplies("Digital Camera", 2);
    supplies[6] = new Supplies("Manual", 10);
    supplies[7] = new Supplies("Lithium Battery", 50);
    supplies[8] = new Supplies("Parachute", 10);
    supplies[9] = new Supplies("Laptop", 5);
  }

  public Food[] getFoodArray() {
    return food.clone();
  }
  public Parts[] getPartsArray() {
    return parts.clone();
  }
  public Supplies[] getSuppliesArray() {
    return supplies.clone();
  }
}