package com.dto.hello.domain.user.data.entity;

import com.dto.hello.domain.to_do.data.entity.ToDo;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "user")
public class User {
    @Id
    @Column(name ="user_id")
    private String userId;

    private String password;

    @Column(name = "user_img")
    private String userImg;

    private String description;

    @Column(nullable = false,name = "refresh_token")
    private String refreshToken;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL.REMOVE)
    private List<ToDo> toDo;
}
