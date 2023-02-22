class TryCatchDuck {
    public static void main(String[] args) {
        System.out.println("\nYou are a proud owner of a snow-white pet duck");
        
        try{
            System.out.println("You approach your duck");
            ApproachDuck("front");
            
            System.out.println("You place your palm firmly under its soft belly");
            PickUpDuck(1);
        }
        catch (DuckIsScaredException dise){
            System.out.println("The duck is too scared, and waddles away from you!");
        }
        catch (DuckIsTooHeavyException dithe){
            System.out.println("The duck is too heavy to lift! You leave it on the ground");
        } finally{
            System.out.println("You'll always love your duckie");
        }
        
        System.out.println();
    }

    static void ApproachDuck(String direction) throws DuckIsScaredException{
        if (direction.equalsIgnoreCase("front"))
            System.out.println("Duck stands still for you obediently");
        else{
            throw new DuckIsScaredException();
        }
    }

    static void PickUpDuck(int duckWeight) throws DuckIsTooHeavyException{
        if (duckWeight > 20)
        throw new DuckIsTooHeavyException();
        else {
            System.out.println("You are now successfully holding the duck in your hand!");
        }
    }
}