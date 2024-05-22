public class Task {

        private static int taskCount = 0;
        private int taskNumber;
        private String taskName;
        private String taskDescription;
        private String developerDetails;
        private int taskDuration;
        private String taskStatus;
        private String taskId;

        public Task() {
            this.taskNumber = taskCount++;
            this.taskName = taskName;
            this.taskDescription = taskDescription;
            this.developerDetails = developerDetails;
            this.taskDuration = taskDuration;
            this.taskStatus = taskStatus;
            this.taskId = generateTaskId();
        }

        private String generateTaskId() {
            return (taskName.length() > 1 ? taskName.substring(0, 2) : taskName) + ":" + taskNumber + ":" +
                    (developerDetails.length() > 2 ? developerDetails.substring(0, 3) : developerDetails).toUpperCase();
        }

        @Override
        public String toString() {
            return "Task Status: " + taskStatus + "\n" +
                    "Developer Details: " + developerDetails + "\n" +
                    "Task Number: " + taskNumber + "\n" +
                    "Task Name: " + taskName + "\n" +
                    "Task Description: " + taskDescription + "\n" +
                    "Task ID: " + taskId + "\n" +
                    "Task Duration: " + taskDuration + " hours";
        }
    }


