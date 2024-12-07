package gamers_list.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "rang")
    private int rang;

    @Column(name = "main_character")
    private String mainCharacter;

    public User() {
    }

    public User(String nickname, int rang, String mainCharacter) {
        this.nickname = nickname;
        this.rang = rang;
        this.mainCharacter = mainCharacter;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    @Override
    public String toString() {
        return "Игрок #" + id + " " + nickname + " " + rang + " уровня играет за персонажа " + mainCharacter;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rang);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        User other = (User) obj;
        return (this.id.equals(other.getId()) && this.rang == other.getRang()
                && this.nickname.equals(other.getNickname())
                && this.mainCharacter.equals(other.getMainCharacter()));
    }
}

