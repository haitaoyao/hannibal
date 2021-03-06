/*
 * Copyright 2013 Sentric. See LICENSE for details.
 */

package controllers

import play.api.mvc._

object Servers extends Controller {
  def index = Action { implicit request =>
    Ok(views.html.servers.index(request))
  }
}