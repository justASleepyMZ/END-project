// PricingStrategy interface
interface PricingStrategy {
    double calculatePrice(Room room);
}

// Regular pricing strategy (no discount)
class RegularPriceStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Room room) {
        return room.getRate();
    }
}

// Seasonal discount strategy
class SeasonalDiscountStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Room room) {
        return room.getRate() * 0.9; // 10% discount
    }
}

// Context to switch between different pricing strategies
class PriceContext {
    private PricingStrategy strategy;

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double getFinalPrice(Room room) {
        return strategy.calculatePrice(room);
    }
}
