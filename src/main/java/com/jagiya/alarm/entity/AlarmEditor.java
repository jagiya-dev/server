package com.jagiya.alarm.entity;

import lombok.Getter;

@Getter
public class AlarmEditor {

    private String alarmTime;
    private String reminder;
    private Integer vibration;
    private Integer volume;
    private Integer enabled;
    private Long alarmSoundId;

    public AlarmEditor(String alarmTime, String reminder, Integer vibration, Integer volume, Integer enabled, Long alarmSoundId) {
        this.alarmTime = alarmTime;
        this.reminder = reminder;
        this.vibration = vibration;
        this.volume = volume;
        this.enabled = enabled;
        this.alarmSoundId = alarmSoundId;
    }
    public static AlarmEditorBuilder builder() {
        return new AlarmEditorBuilder();
    }

    public static class AlarmEditorBuilder {
        private String alarmTime;
        private String reminder;
        private Integer vibration;
        private Integer volume;
        private Integer enabled;
        private Long alarmSoundId;

        AlarmEditorBuilder() {
        }

        public AlarmEditorBuilder alarmTime(final String alarmTime) {
            if (alarmTime != null) {
                this.alarmTime = alarmTime;
            }
            return this;
        }

        public AlarmEditorBuilder reminder(final String reminder) {
            if (reminder != null) {
                this.reminder = reminder;
            }
            return this;
        }

        public AlarmEditorBuilder vibration(final Integer vibration) {
            if (vibration != null) {
                this.vibration = vibration;
            }
            return this;
        }

        public AlarmEditorBuilder volume(final Integer volume) {
            if (volume != null) {
                this.volume = volume;
            }
            return this;
        }

        public AlarmEditorBuilder enabled(final Integer enabled) {
            if (enabled != null) {
                this.enabled = enabled;
            }
            return this;
        }

        public AlarmEditorBuilder alarmSoundId(final Long alarmSoundId) {
            if (alarmSoundId != null) {
                this.alarmSoundId = alarmSoundId;
            }
            return this;
        }

        public AlarmEditor build() {
            return new AlarmEditor(this.alarmTime, this.reminder, this.vibration, this.volume, this.enabled, this.alarmSoundId);
        }

    }
}
