package lesson7;

public class Temperature {

        Metric MetricObject;
        Imperial ImperialObject;


        // Getter Methods

        public Metric getMetric() {
            return MetricObject;
        }

        public Imperial getImperial() {
            return ImperialObject;
        }

        // Setter Methods

        public void setMetric(Metric MetricObject) {
            this.MetricObject = MetricObject;
        }

        public void setImperial(Imperial ImperialObject) {
            this.ImperialObject = ImperialObject;
        }
    }


