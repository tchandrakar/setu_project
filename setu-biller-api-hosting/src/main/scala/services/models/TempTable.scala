package services.models

import slick.lifted.{ProvenShape, Tag}
import slick.jdbc.PostgresProfile.api._

case class BookAuthor(id: Long, authorId: Long, bookId: Long)

class BookAuthors(tag: Tag) extends Table[BookAuthor](tag, "book_authors") {

  def id: Rep[Long] = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def authorId: Rep[Long] = column[Long]("author_id")
  def bookId: Rep[Long] = column[Long]("book_id")

  def * : ProvenShape[BookAuthor] = (id, authorId, bookId) <> (BookAuthor.tupled, BookAuthor.unapply)
}

object BookAuthors {
  lazy val query = TableQuery[BookAuthors]
}