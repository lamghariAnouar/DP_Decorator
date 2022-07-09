package decorator;

import boissons.Boisson;

public class Chocollat extends AbstractDecorator {
    public Chocollat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"Au chocollat";
    }

    @Override
    public double cout() {
        return 0.7+ boisson.cout();
    }
}
