package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

        private String LocalObservationDateTime;
        private float EpochTime;
        private String WeatherText;
        private float WeatherIcon;
        private boolean HasPrecipitation;
        private String PrecipitationType = null;
        private boolean IsDayTime;
        Temperature TemperatureObject;
        private String MobileLink;
        private String Link;


        // Getter Methods

        public String getLocalObservationDateTime() {
            return LocalObservationDateTime;
        }

        public float getEpochTime() {
            return EpochTime;
        }

        public String getWeatherText() {
            return WeatherText;
        }

        public float getWeatherIcon() {
            return WeatherIcon;
        }

        public boolean getHasPrecipitation() {
            return HasPrecipitation;
        }

        public String getPrecipitationType() {
            return PrecipitationType;
        }

        public boolean getIsDayTime() {
            return IsDayTime;
        }

        public Temperature getTemperature() {
            return TemperatureObject;
        }

        public String getMobileLink() {
            return MobileLink;
        }

        public String getLink() {
            return Link;
        }

        // Setter Methods

        public void setLocalObservationDateTime(String LocalObservationDateTime) {
            this.LocalObservationDateTime = LocalObservationDateTime;
        }

        public void setEpochTime(float EpochTime) {
            this.EpochTime = EpochTime;
        }

        public void setWeatherText(String WeatherText) {
            this.WeatherText = WeatherText;
        }

        public void setWeatherIcon(float WeatherIcon) {
            this.WeatherIcon = WeatherIcon;
        }

        public void setHasPrecipitation(boolean HasPrecipitation) {
            this.HasPrecipitation = HasPrecipitation;
        }

        public void setPrecipitationType(String PrecipitationType) {
            this.PrecipitationType = PrecipitationType;
        }

        public void setIsDayTime(boolean IsDayTime) {
            this.IsDayTime = IsDayTime;
        }

        public void setTemperature(Temperature TemperatureObject) {
            this.TemperatureObject = TemperatureObject;
        }

        public void setMobileLink(String MobileLink) {
            this.MobileLink = MobileLink;
        }

        public void setLink(String Link) {
            this.Link = Link;
        }
    }











