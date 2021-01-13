public class VinniPuxImpl extends Animal implements VinniPux {
    public VinniPuxImpl(String name) {
        super(name);
    }

    @Override
    public void getFatterRhyme() {
        System.out.println("\"неважно, чем я занят, так как я толстеть не стану, а ведь я толстеть не стану\"");
    }

    @Override
    public void noGetFat(Zanyatie zanyatie) {
        switch(zanyatie) {
            case EAT_HONEY:
                System.out.println("от меда медведи не толстеют");
                setForm(PhysicalForm.DEFAULT);
                break;
            case EAT_SALAD:
                System.out.println("это полезное, его моно");
                setForm(PhysicalForm.DEFAULT);
                break;
            case EAT_PORRIGE:
                System.out.println("на завтрак моно кушать все и не толстеть");
                setForm(PhysicalForm.DEFAULT);
                break;
        }
    }

    @Override
    public void walk() {
        System.out.println(this + " " + MovingTypes.WALK.getMove());
    }

    @Override
    public void readPoetical(Animal receiver) {
        System.out.println(this + " рассказывал в стихах " + receiver);
    }

}
