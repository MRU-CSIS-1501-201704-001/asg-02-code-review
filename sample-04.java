 //new duration
        double newDuration = videoLength / playbackRate;
        double newDurationInSeconds = Math.round((newDuration * SECONDS_IN_A_MINUTE));
        int newHours = (int) newDurationInSeconds / SECONDS_IN_A_HOUR;
        int newMinutes = (int) (newDurationInSeconds % SECONDS_IN_A_HOUR) / SECONDS_IN_A_MINUTE;
        int newSeconds = (int) newDurationInSeconds % SECONDS_IN_A_MINUTE;