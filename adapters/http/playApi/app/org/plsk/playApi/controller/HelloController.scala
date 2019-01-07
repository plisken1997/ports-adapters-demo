package org.plsk.playApi.controller

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def hello = Action {
    Ok(views.html.hello())
  }

}
