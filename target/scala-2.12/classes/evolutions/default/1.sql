# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comments (
  id                            bigserial not null,
  user_id                       bigint not null,
  thread_id                     bigint not null,
  msg                           varchar(255) not null,
  vote_count                    bigint not null,
  created_date                  timestamptz not null,
  constraint pk_comments primary key (id)
);

create table image (
  id                            bigserial not null,
  name                          varchar(255),
  data                          bytea,
  constraint pk_image primary key (id)
);

create table threads (
  id                            bigserial not null,
  user_id                       bigint not null,
  title                         varchar(255) not null,
  msg                           varchar(255) not null,
  sub_count                     bigint not null,
  vote_count                    bigint not null,
  image_id                      bigint,
  created_date                  timestamptz not null,
  constraint uq_threads_image_id unique (image_id),
  constraint pk_threads primary key (id)
);

create table usr (
  id                            bigserial not null,
  token                         varchar(255),
  name                          varchar(255) not null,
  email                         varchar(255) not null,
  password                      varchar(255) not null,
  karma                         bigint not null,
  joined_date                   timestamptz not null,
  constraint pk_usr primary key (id)
);

alter table threads add constraint fk_threads_image_id foreign key (image_id) references image (id) on delete restrict on update restrict;


# --- !Downs

alter table if exists threads drop constraint if exists fk_threads_image_id;

drop table if exists comments cascade;

drop table if exists image cascade;

drop table if exists threads cascade;

drop table if exists usr cascade;

