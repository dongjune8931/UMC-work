package UMC.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 1986060796L;

    public static final QMember member = new QMember("member1");

    public final UMC.study.domain.common.QBaseEntity _super = new UMC.study.domain.common.QBaseEntity(this);

    public final StringPath address = createString("address");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final EnumPath<UMC.study.domain.enums.Gender> gender = createEnum("gender", UMC.study.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> inactiveDate = createDate("inactiveDate", java.time.LocalDate.class);

    public final ListPath<UMC.study.domain.mapping.MemberAgree, UMC.study.domain.mapping.QMemberAgree> memberAgreeList = this.<UMC.study.domain.mapping.MemberAgree, UMC.study.domain.mapping.QMemberAgree>createList("memberAgreeList", UMC.study.domain.mapping.MemberAgree.class, UMC.study.domain.mapping.QMemberAgree.class, PathInits.DIRECT2);

    public final ListPath<UMC.study.domain.mapping.MemberMission, UMC.study.domain.mapping.QMemberMission> memberMissionList = this.<UMC.study.domain.mapping.MemberMission, UMC.study.domain.mapping.QMemberMission>createList("memberMissionList", UMC.study.domain.mapping.MemberMission.class, UMC.study.domain.mapping.QMemberMission.class, PathInits.DIRECT2);

    public final ListPath<UMC.study.domain.mapping.MemberPrefer, UMC.study.domain.mapping.QMemberPrefer> memberPreferList = this.<UMC.study.domain.mapping.MemberPrefer, UMC.study.domain.mapping.QMemberPrefer>createList("memberPreferList", UMC.study.domain.mapping.MemberPrefer.class, UMC.study.domain.mapping.QMemberPrefer.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    public final EnumPath<UMC.study.domain.enums.SocialType> socialType = createEnum("socialType", UMC.study.domain.enums.SocialType.class);

    public final StringPath specAddress = createString("specAddress");

    public final EnumPath<UMC.study.domain.enums.MemberStatus> status = createEnum("status", UMC.study.domain.enums.MemberStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateAt = _super.updateAt;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

