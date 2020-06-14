package controllers

import com.google.inject.{Inject, Singleton}
import play.api.Configuration
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class ReceiptController @Inject()(cc: ControllerComponents,
                                  config: Configuration) extends AbstractController(cc) {
  def setuMockUrl = {
    config.getOptional[String]("setu-base-url") match {
      case Some(url) => url
      case None => throw new Exception(s"Url not configured")
    }
  }
  def fetchBills = Action.async(parse.json) { implicit request =>
    ???
  }

  def fetchReceipt = Action.async(parse.json) { implicit request =>
    ???
  }

}
