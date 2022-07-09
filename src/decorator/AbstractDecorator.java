package decorator;

import boissons.Boisson;

public abstract class AbstractDecorator extends Boisson {
    protected Boisson boisson;//un decorateur decore un boisson

    public AbstractDecorator(Boisson boisson) {
        super();
        this.boisson = boisson;
    }
    public abstract String getDescription();
}
