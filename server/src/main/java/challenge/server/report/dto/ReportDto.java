package challenge.server.report.dto;

import lombok.*;

public class ReportDto {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Post {
        private Long postId;
        private String postType; // enum 타입 ORDINAL or STRING 정하기
        private String reportType;
        private Long reporterUserId;
        private Long reportedUserId;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Long reportId;
        private Long postId;
        private String postType; // enum 타입 ORDINAL or STRING 정하기
        private String reportType;
        private Long reporterUserId;
        private Long reportedUserId;
    }
}