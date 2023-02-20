class TryCatchDuck {
    public static void main(String[] args) {
        System.out.println("You are a proud owner of a snow-white pet duck.");

        try{
            System.out.println("You approach your duck.");
            ApproachDuck("back");
            System.out.println("You try to pick up your duck.");
            //PickUpDuck(900);
        }
        catch (DuckIsScaredException a){
            System.out.println("The duck is too scared, and waddles away from you!");
        }
        catch (DuckIsTooHeavyException b){
            System.out.println("The duck is too heavy to lift! Leave it on the ground.");
        } finally{
            System.out.println("You will always love your duckie.");
        }

        System.out.println();
    }

    static void ApproachDuck(String direction) throws Exception{
        if (direction.equalsIgnoreCase("front"))
            System.out.println("Duck stands still for you obediently");
        else{
            throw new DuckIsScaredException();
        }
    }

    static void PickUpDuck(int duckWeight) throws Exception{

    }
}