package io.bcn.springConference.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

    @Entity
    @Table(name = "conferences")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Conference {

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID",
                strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", updatable = false,
                nullable = false)
        private UUID id;

        @Column(nullable = false)
        private String date;

        @Column(name = "youtube_link")
        private String linkToYouTubeVideo;

        @Column(nullable = false)
        private String title;

        @Column(name = "conference_name",
                nullable = false)
        private String conferenceName;

        @Column(columnDefinition = "TEXT")
        private String content;

        private Integer duration;

        private String room;

        @ManyToOne
        @JoinColumn(name = "book_id",
                nullable = false)
        private Book book;

        @ManyToOne
        @JoinColumn(name = "speaker_id",
                nullable = false)
        private Speaker speaker;

}
